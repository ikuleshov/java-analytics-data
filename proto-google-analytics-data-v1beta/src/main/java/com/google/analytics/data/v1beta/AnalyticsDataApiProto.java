/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/data/v1beta/analytics_data_api.proto

package com.google.analytics.data.v1beta;

public final class AnalyticsDataApiProto {
  private AnalyticsDataApiProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_Metadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_Metadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_RunReportRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_RunReportResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_RunPivotReportRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunPivotReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_RunPivotReportResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunPivotReportResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_BatchRunReportsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_BatchRunReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_BatchRunPivotReportsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_BatchRunPivotReportsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_GetMetadataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_GetMetadataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_RunRealtimeReportRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunRealtimeReportRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_analytics_data_v1beta_RunRealtimeReportResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_analytics_data_v1beta_RunRealtimeReportResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/analytics/data/v1beta/analytics"
          + "_data_api.proto\022\034google.analytics.data.v"
          + "1beta\032\'google/analytics/data/v1beta/data"
          + ".proto\032\034google/api/annotations.proto\032\027go"
          + "ogle/api/client.proto\032\037google/api/field_"
          + "behavior.proto\032\031google/api/resource.prot"
          + "o\"\350\001\n\010Metadata\022\014\n\004name\030\003 \001(\t\022C\n\ndimensio"
          + "ns\030\001 \003(\0132/.google.analytics.data.v1beta."
          + "DimensionMetadata\022=\n\007metrics\030\002 \003(\0132,.goo"
          + "gle.analytics.data.v1beta.MetricMetadata"
          + ":J\352AG\n%analyticsdata.googleapis.com/Meta"
          + "data\022\036properties/{property}/metadata\"\244\005\n"
          + "\020RunReportRequest\022\020\n\010property\030\001 \001(\t\022;\n\nd"
          + "imensions\030\002 \003(\0132\'.google.analytics.data."
          + "v1beta.Dimension\0225\n\007metrics\030\003 \003(\0132$.goog"
          + "le.analytics.data.v1beta.Metric\022<\n\013date_"
          + "ranges\030\004 \003(\0132\'.google.analytics.data.v1b"
          + "eta.DateRange\022H\n\020dimension_filter\030\005 \001(\0132"
          + "..google.analytics.data.v1beta.FilterExp"
          + "ression\022E\n\rmetric_filter\030\006 \001(\0132..google."
          + "analytics.data.v1beta.FilterExpression\022\021"
          + "\n\tpage_size\030\007 \001(\005\022\022\n\npage_token\030\010 \001(\t\022L\n"
          + "\023metric_aggregations\030\t \003(\0162/.google.anal"
          + "ytics.data.v1beta.MetricAggregation\0228\n\to"
          + "rder_bys\030\n \003(\0132%.google.analytics.data.v"
          + "1beta.OrderBy\022\025\n\rcurrency_code\030\013 \001(\t\022=\n\013"
          + "cohort_spec\030\014 \001(\0132(.google.analytics.dat"
          + "a.v1beta.CohortSpec\022\027\n\017keep_empty_rows\030\r"
          + " \001(\010\022\035\n\025return_property_quota\030\016 \001(\010\"\243\004\n\021"
          + "RunReportResponse\022H\n\021dimension_headers\030\001"
          + " \003(\0132-.google.analytics.data.v1beta.Dime"
          + "nsionHeader\022B\n\016metric_headers\030\002 \003(\0132*.go"
          + "ogle.analytics.data.v1beta.MetricHeader\022"
          + "/\n\004rows\030\003 \003(\0132!.google.analytics.data.v1"
          + "beta.Row\0221\n\006totals\030\004 \003(\0132!.google.analyt"
          + "ics.data.v1beta.Row\0223\n\010maximums\030\005 \003(\0132!."
          + "google.analytics.data.v1beta.Row\0223\n\010mini"
          + "mums\030\006 \003(\0132!.google.analytics.data.v1bet"
          + "a.Row\022\027\n\017next_page_token\030\007 \001(\t\022\022\n\ntotal_"
          + "size\030\010 \001(\005\022@\n\010metadata\030\t \001(\0132..google.an"
          + "alytics.data.v1beta.ResponseMetaData\022C\n\016"
          + "property_quota\030\n \001(\0132+.google.analytics."
          + "data.v1beta.PropertyQuota\"\257\004\n\025RunPivotRe"
          + "portRequest\022\020\n\010property\030\001 \001(\t\022;\n\ndimensi"
          + "ons\030\002 \003(\0132\'.google.analytics.data.v1beta"
          + ".Dimension\0225\n\007metrics\030\003 \003(\0132$.google.ana"
          + "lytics.data.v1beta.Metric\022<\n\013date_ranges"
          + "\030\004 \003(\0132\'.google.analytics.data.v1beta.Da"
          + "teRange\0223\n\006pivots\030\005 \003(\0132#.google.analyti"
          + "cs.data.v1beta.Pivot\022H\n\020dimension_filter"
          + "\030\006 \001(\0132..google.analytics.data.v1beta.Fi"
          + "lterExpression\022E\n\rmetric_filter\030\007 \001(\0132.."
          + "google.analytics.data.v1beta.FilterExpre"
          + "ssion\022\025\n\rcurrency_code\030\010 \001(\t\022=\n\013cohort_s"
          + "pec\030\t \001(\0132(.google.analytics.data.v1beta"
          + ".CohortSpec\022\027\n\017keep_empty_rows\030\n \001(\010\022\035\n\025"
          + "return_property_quota\030\013 \001(\010\"\327\003\n\026RunPivot"
          + "ReportResponse\022@\n\rpivot_headers\030\001 \003(\0132)."
          + "google.analytics.data.v1beta.PivotHeader"
          + "\022H\n\021dimension_headers\030\002 \003(\0132-.google.ana"
          + "lytics.data.v1beta.DimensionHeader\022B\n\016me"
          + "tric_headers\030\003 \003(\0132*.google.analytics.da"
          + "ta.v1beta.MetricHeader\022/\n\004rows\030\004 \003(\0132!.g"
          + "oogle.analytics.data.v1beta.Row\0225\n\naggre"
          + "gates\030\005 \003(\0132!.google.analytics.data.v1be"
          + "ta.Row\022@\n\010metadata\030\006 \001(\0132..google.analyt"
          + "ics.data.v1beta.ResponseMetaData\022C\n\016prop"
          + "erty_quota\030\007 \001(\0132+.google.analytics.data"
          + ".v1beta.PropertyQuota\"l\n\026BatchRunReports"
          + "Request\022\020\n\010property\030\001 \001(\t\022@\n\010requests\030\002 "
          + "\003(\0132..google.analytics.data.v1beta.RunRe"
          + "portRequest\"[\n\027BatchRunReportsResponse\022@"
          + "\n\007reports\030\001 \003(\0132/.google.analytics.data."
          + "v1beta.RunReportResponse\"v\n\033BatchRunPivo"
          + "tReportsRequest\022\020\n\010property\030\001 \001(\t\022E\n\010req"
          + "uests\030\002 \003(\01323.google.analytics.data.v1be"
          + "ta.RunPivotReportRequest\"k\n\034BatchRunPivo"
          + "tReportsResponse\022K\n\rpivot_reports\030\001 \003(\0132"
          + "4.google.analytics.data.v1beta.RunPivotR"
          + "eportResponse\"Q\n\022GetMetadataRequest\022;\n\004n"
          + "ame\030\001 \001(\tB-\340A\002\372A\'\n%analyticsdata.googlea"
          + "pis.com/Metadata\"\353\003\n\030RunRealtimeReportRe"
          + "quest\022\020\n\010property\030\001 \001(\t\022;\n\ndimensions\030\002 "
          + "\003(\0132\'.google.analytics.data.v1beta.Dimen"
          + "sion\0225\n\007metrics\030\003 \003(\0132$.google.analytics"
          + ".data.v1beta.Metric\022H\n\020dimension_filter\030"
          + "\004 \001(\0132..google.analytics.data.v1beta.Fil"
          + "terExpression\022E\n\rmetric_filter\030\005 \001(\0132..g"
          + "oogle.analytics.data.v1beta.FilterExpres"
          + "sion\022\021\n\tpage_size\030\006 \001(\005\022L\n\023metric_aggreg"
          + "ations\030\007 \003(\0162/.google.analytics.data.v1b"
          + "eta.MetricAggregation\0228\n\torder_bys\030\010 \003(\013"
          + "2%.google.analytics.data.v1beta.OrderBy\022"
          + "\035\n\025return_property_quota\030\t \001(\010\"\320\003\n\031RunRe"
          + "altimeReportResponse\022H\n\021dimension_header"
          + "s\030\001 \003(\0132-.google.analytics.data.v1beta.D"
          + "imensionHeader\022B\n\016metric_headers\030\002 \003(\0132*"
          + ".google.analytics.data.v1beta.MetricHead"
          + "er\022/\n\004rows\030\003 \003(\0132!.google.analytics.data"
          + ".v1beta.Row\0221\n\006totals\030\004 \003(\0132!.google.ana"
          + "lytics.data.v1beta.Row\0223\n\010maximums\030\005 \003(\013"
          + "2!.google.analytics.data.v1beta.Row\0223\n\010m"
          + "inimums\030\006 \003(\0132!.google.analytics.data.v1"
          + "beta.Row\022\022\n\ntotal_size\030\007 \001(\005\022C\n\016property"
          + "_quota\030\010 \001(\0132+.google.analytics.data.v1b"
          + "eta.PropertyQuota2\343\t\n\021BetaAnalyticsData\022"
          + "\242\001\n\tRunReport\022..google.analytics.data.v1"
          + "beta.RunReportRequest\032/.google.analytics"
          + ".data.v1beta.RunReportResponse\"4\202\323\344\223\002.\")"
          + "/v1beta/{property=properties/*}:runRepor"
          + "t:\001*\022\266\001\n\016RunPivotReport\0223.google.analyti"
          + "cs.data.v1beta.RunPivotReportRequest\0324.g"
          + "oogle.analytics.data.v1beta.RunPivotRepo"
          + "rtResponse\"9\202\323\344\223\0023\"./v1beta/{property=pr"
          + "operties/*}:runPivotReport:\001*\022\272\001\n\017BatchR"
          + "unReports\0224.google.analytics.data.v1beta"
          + ".BatchRunReportsRequest\0325.google.analyti"
          + "cs.data.v1beta.BatchRunReportsResponse\":"
          + "\202\323\344\223\0024\"//v1beta/{property=properties/*}:"
          + "batchRunReports:\001*\022\316\001\n\024BatchRunPivotRepo"
          + "rts\0229.google.analytics.data.v1beta.Batch"
          + "RunPivotReportsRequest\032:.google.analytic"
          + "s.data.v1beta.BatchRunPivotReportsRespon"
          + "se\"?\202\323\344\223\0029\"4/v1beta/{property=properties"
          + "/*}:batchRunPivotReports:\001*\022\234\001\n\013GetMetad"
          + "ata\0220.google.analytics.data.v1beta.GetMe"
          + "tadataRequest\032&.google.analytics.data.v1"
          + "beta.Metadata\"3\202\323\344\223\002&\022$/v1beta/{name=pro"
          + "perties/*/metadata}\332A\004name\022\302\001\n\021RunRealti"
          + "meReport\0226.google.analytics.data.v1beta."
          + "RunRealtimeReportRequest\0327.google.analyt"
          + "ics.data.v1beta.RunRealtimeReportRespons"
          + "e\"<\202\323\344\223\0026\"1/v1beta/{property=properties/"
          + "*}:runRealtimeReport:\001*\032~\312A\034analyticsdat"
          + "a.googleapis.com\322A\\https://www.googleapi"
          + "s.com/auth/analytics,https://www.googlea"
          + "pis.com/auth/analytics.readonlyB}\n com.g"
          + "oogle.analytics.data.v1betaB\025AnalyticsDa"
          + "taApiProtoP\001Z@google.golang.org/genproto"
          + "/googleapis/analytics/data/v1beta;datab\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.analytics.data.v1beta.ReportingApiProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_analytics_data_v1beta_Metadata_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_analytics_data_v1beta_Metadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_Metadata_descriptor,
            new java.lang.String[] {
              "Name", "Dimensions", "Metrics",
            });
    internal_static_google_analytics_data_v1beta_RunReportRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_analytics_data_v1beta_RunReportRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_RunReportRequest_descriptor,
            new java.lang.String[] {
              "Property",
              "Dimensions",
              "Metrics",
              "DateRanges",
              "DimensionFilter",
              "MetricFilter",
              "PageSize",
              "PageToken",
              "MetricAggregations",
              "OrderBys",
              "CurrencyCode",
              "CohortSpec",
              "KeepEmptyRows",
              "ReturnPropertyQuota",
            });
    internal_static_google_analytics_data_v1beta_RunReportResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_analytics_data_v1beta_RunReportResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_RunReportResponse_descriptor,
            new java.lang.String[] {
              "DimensionHeaders",
              "MetricHeaders",
              "Rows",
              "Totals",
              "Maximums",
              "Minimums",
              "NextPageToken",
              "TotalSize",
              "Metadata",
              "PropertyQuota",
            });
    internal_static_google_analytics_data_v1beta_RunPivotReportRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_analytics_data_v1beta_RunPivotReportRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_RunPivotReportRequest_descriptor,
            new java.lang.String[] {
              "Property",
              "Dimensions",
              "Metrics",
              "DateRanges",
              "Pivots",
              "DimensionFilter",
              "MetricFilter",
              "CurrencyCode",
              "CohortSpec",
              "KeepEmptyRows",
              "ReturnPropertyQuota",
            });
    internal_static_google_analytics_data_v1beta_RunPivotReportResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_analytics_data_v1beta_RunPivotReportResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_RunPivotReportResponse_descriptor,
            new java.lang.String[] {
              "PivotHeaders",
              "DimensionHeaders",
              "MetricHeaders",
              "Rows",
              "Aggregates",
              "Metadata",
              "PropertyQuota",
            });
    internal_static_google_analytics_data_v1beta_BatchRunReportsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_analytics_data_v1beta_BatchRunReportsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_BatchRunReportsRequest_descriptor,
            new java.lang.String[] {
              "Property", "Requests",
            });
    internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_BatchRunReportsResponse_descriptor,
            new java.lang.String[] {
              "Reports",
            });
    internal_static_google_analytics_data_v1beta_BatchRunPivotReportsRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_analytics_data_v1beta_BatchRunPivotReportsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_BatchRunPivotReportsRequest_descriptor,
            new java.lang.String[] {
              "Property", "Requests",
            });
    internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_BatchRunPivotReportsResponse_descriptor,
            new java.lang.String[] {
              "PivotReports",
            });
    internal_static_google_analytics_data_v1beta_GetMetadataRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_analytics_data_v1beta_GetMetadataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_GetMetadataRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_analytics_data_v1beta_RunRealtimeReportRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_analytics_data_v1beta_RunRealtimeReportRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_RunRealtimeReportRequest_descriptor,
            new java.lang.String[] {
              "Property",
              "Dimensions",
              "Metrics",
              "DimensionFilter",
              "MetricFilter",
              "PageSize",
              "MetricAggregations",
              "OrderBys",
              "ReturnPropertyQuota",
            });
    internal_static_google_analytics_data_v1beta_RunRealtimeReportResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_analytics_data_v1beta_RunRealtimeReportResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_analytics_data_v1beta_RunRealtimeReportResponse_descriptor,
            new java.lang.String[] {
              "DimensionHeaders",
              "MetricHeaders",
              "Rows",
              "Totals",
              "Maximums",
              "Minimums",
              "TotalSize",
              "PropertyQuota",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.analytics.data.v1beta.ReportingApiProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
