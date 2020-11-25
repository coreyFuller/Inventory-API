OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
Request request = new Request.Builder()
  .url("https://CUSports.io/v1/inventory?itemID=<integer>")
  .method("GET", null)
  .build();
Response response = client.newCall(request).execute();


OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("text/plain");
RequestBody body = RequestBody.create(mediaType, "{\n    \"itemID\": \"<integer>\",\n    \"inventory_level\": \"<integer>\",\n    \"reserved\": \"<integer>\"\n}");
Request request = new Request.Builder()
  .url("https://CUSports.io/v1/inventory?itemID=<integer>")
  .method("PUT", body)
  .build();
Response response = client.newCall(request).execute();


OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("text/plain");
RequestBody body = RequestBody.create(mediaType, "{\n    \"itemID\": \"<integer>\",\n    \"item_name\": \"<string>\",\n    \"inventory_level\": \"<integer>\"\n}");
Request request = new Request.Builder()
  .url("https://CUSports.io/v1/inventory?itemID=<integer>")
  .method("POST", body)
  .build();
Response response = client.newCall(request).execute();



OkHttpClient client = new OkHttpClient().newBuilder()
  .build();
MediaType mediaType = MediaType.parse("text/plain");
RequestBody body = RequestBody.create(mediaType, "");
Request request = new Request.Builder()
  .url("https://CUSports.io/v1/inventory?itemID=<integer>")
  .method("DELETE", body)
  .build();
Response response = client.newCall(request).execute();