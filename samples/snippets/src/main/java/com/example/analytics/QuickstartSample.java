/*
 * Copyright 2021 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.analytics;

/* Google Analytics Data API sample quickstart application.

This application demonstrates the usage of the Analytics Data API using service account credentials.

Before you start the application, please review the comments starting with
"TODO(developer)" and update the code to use correct values.

To run this sample using Maven:
  cd java-analytics-data/samples/snippets
  mvn compile
  mvn exec:java -Dexec.mainClass="com.example.analytics.QuickstartSample"
 */

// [START google_analytics_data_quickstart]
import com.google.analytics.data.v1beta.BetaAnalyticsDataClient;
import com.google.analytics.data.v1beta.BetaAnalyticsDataSettings;
import com.google.analytics.data.v1beta.DateRange;
import com.google.analytics.data.v1beta.Dimension;
import com.google.analytics.data.v1beta.Metric;
import com.google.analytics.data.v1beta.Row;

import com.google.analytics.data.v1beta.RunReportRequest;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.api.gax.core.FixedCredentialsProvider;
import java.io.FileInputStream;

public class QuickstartSample {

  // This is an example snippet that calls the Google Analytics Data API and runs a simple report
  // on the provided GA4 property id.
  static void sampleRunReport(String propertyId, String credentialsJsonPath) throws Exception {
    /**
     * TODO(developer): Uncomment this variable and replace with your
     * Google Analytics 4 property ID before running the sample.
     */
    // propertyId = "YOUR-GA4-PROPERTY-ID";

    // [START google_analytics_data_initialize]
    /** TODO(developer): Uncomment this variable and replace with a valid path to
     * the credentials.json file for your service account downloaded from the
     * Cloud Console.
     * Otherwise, default service account credentials will be derived from
     * the GOOGLE_APPLICATION_CREDENTIALS environment variable.
     */
    // credentialsJsonPath = "/path/to/credentials.json";

    // Instantiates a client using default credentials.
    // See https://cloud.google.com/docs/authentication/production for more information
    // about managing credentials.
    BetaAnalyticsDataClient analyticsData;
    if (credentialsJsonPath.isEmpty()) {
      // Using a default constructor instructs the client to use the credentials
      // specified in GOOGLE_APPLICATION_CREDENTIALS environment variable.
      analyticsData = BetaAnalyticsDataClient.create();
    } else {
      // Explicitly use service account credentials by specifying
      // the private key file.
      GoogleCredentials credentials = GoogleCredentials
          .fromStream(new FileInputStream(credentialsJsonPath));

      BetaAnalyticsDataSettings betaAnalyticsDataSettings =
          BetaAnalyticsDataSettings.newBuilder()
              .setCredentialsProvider(FixedCredentialsProvider.create(credentials))
              .build();
      analyticsData =
          BetaAnalyticsDataClient.create(betaAnalyticsDataSettings);
    }
    // [END google_analytics_data_initialize]

    // [START google_analytics_data_run_report]
    RunReportRequest request = RunReportRequest.newBuilder()
        .setProperty("properties/" + propertyId)
        .addDimensions(
            Dimension.newBuilder().setName("city"))
        .addMetrics(Metric.newBuilder().setName("activeUsers"))
        .addDateRanges(
            DateRange.newBuilder().setStartDate("2020-03-31").setEndDate("today")).build();

    // Make the request.
    BetaAnalyticsDataClient.RunReportPagedResponse pagedResponse = analyticsData.runReport(request);
    // [END google_analytics_data_run_report]

    // [START google_analytics_data_print_report]
    System.out.println("Report result:");
    // Iterate through every page of the API response.
    for (BetaAnalyticsDataClient.RunReportPage page : pagedResponse.iteratePages()) {
      for (Row row : page.getResponse().getRowsList()) {
        System.out.printf("%s, %s%n", row.getDimensionValues(0).getValue(),
            row.getMetricValues(0).getValue());
      }
    }
    // [END google_analytics_data_print_report]
  }


  public static void main(String... args) throws Exception {
    sampleRunReport("YOUR-GA4-PROPERTY-ID", "");
  }
}

// [END google_analytics_data_quickstart]