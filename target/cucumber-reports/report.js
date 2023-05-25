$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/feature/OrderCreation/ShipperOrderCreation.feature");
formatter.feature({
  "name": "Shipper Order Creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Shipper creates an order in Ninja Van",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the shipper is registered in Ninja Van",
  "keyword": "Given "
});
formatter.match({
  "location": "ShipperOrderCreationSteps.shipperRegisteredInNinjaVan()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "shipper authenticates to the Ninja Van system",
  "keyword": "When "
});
formatter.match({
  "location": "ShipperOrderCreationSteps.shipperAuthenticatesToNinjaVan()"
});
formatter.result({
  "error_message": "javax.net.ssl.SSLException: Certificate for \u003cv4.ninja.com\u003e doesn\u0027t match any of the subject alternative names: [*.hostmonster.com, hostmonster.com]\r\n\tat org.apache.http.conn.ssl.AbstractVerifier.verify(AbstractVerifier.java:177)\r\n\tat org.apache.http.conn.ssl.BrowserCompatHostnameVerifier.verify(BrowserCompatHostnameVerifier.java:62)\r\n\tat org.apache.http.conn.ssl.AbstractVerifier.verify(AbstractVerifier.java:153)\r\n\tat org.apache.http.conn.ssl.AbstractVerifier.verify(AbstractVerifier.java:115)\r\n\tat org.apache.http.conn.ssl.SSLSocketFactory.verifyHostname(SSLSocketFactory.java:577)\r\n\tat org.apache.http.conn.ssl.SSLSocketFactory.createLayeredSocket(SSLSocketFactory.java:571)\r\n\tat org.apache.http.conn.ssl.SSLSocketFactory.connectSocket(SSLSocketFactory.java:554)\r\n\tat org.apache.http.conn.ssl.SSLSocketFactory.connectSocket(SSLSocketFactory.java:415)\r\n\tat org.apache.http.impl.conn.DefaultClientConnectionOperator.openConnection(DefaultClientConnectionOperator.java:180)\r\n\tat org.apache.http.impl.conn.ManagedClientConnectionImpl.open(ManagedClientConnectionImpl.java:326)\r\n\tat org.apache.http.impl.client.DefaultRequestDirector.tryConnect(DefaultRequestDirector.java:605)\r\n\tat org.apache.http.impl.client.DefaultRequestDirector.execute(DefaultRequestDirector.java:440)\r\n\tat org.apache.http.impl.client.AbstractHttpClient.doExecute(AbstractHttpClient.java:835)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:83)\r\n\tat org.apache.http.impl.client.CloseableHttpClient.execute(CloseableHttpClient.java:56)\r\n\tat org.apache.http.client.HttpClient$execute$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:148)\r\n\tat io.restassured.internal.RequestSpecificationImpl$RestAssuredHttpBuilder.doRequest(RequestSpecificationImpl.groovy:2072)\r\n\tat io.restassured.internal.http.HTTPBuilder.post(HTTPBuilder.java:350)\r\n\tat io.restassured.internal.http.HTTPBuilder$post$2.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:148)\r\n\tat io.restassured.internal.RequestSpecificationImpl.sendRequest(RequestSpecificationImpl.groovy:1183)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1268)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1035)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:819)\r\n\tat groovy.lang.GroovyObject.invokeMethod(GroovyObject.java:39)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:166)\r\n\tat io.restassured.internal.filter.SendRequestFilter.filter(SendRequestFilter.groovy:30)\r\n\tat io.restassured.filter.Filter$filter$0.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat io.restassured.filter.Filter$filter.call(Unknown Source)\r\n\tat io.restassured.internal.filter.FilterContextImpl.next(FilterContextImpl.groovy:72)\r\n\tat io.restassured.filter.time.TimingFilter.filter(TimingFilter.java:56)\r\n\tat io.restassured.filter.Filter$filter.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:157)\r\n\tat io.restassured.internal.filter.FilterContextImpl.next(FilterContextImpl.groovy:72)\r\n\tat io.restassured.filter.FilterContext$next.call(Unknown Source)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCall(CallSiteArray.java:47)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:125)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.call(AbstractCallSite.java:148)\r\n\tat io.restassured.internal.RequestSpecificationImpl.applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy:1672)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1268)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1035)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:819)\r\n\tat groovy.lang.GroovyObject.invokeMethod(GroovyObject.java:39)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:51)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:171)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:203)\r\n\tat io.restassured.internal.RequestSpecificationImpl.applyPathParamsAndSendRequest(RequestSpecificationImpl.groovy:1678)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat org.codehaus.groovy.reflection.CachedMethod.invoke(CachedMethod.java:107)\r\n\tat groovy.lang.MetaMethod.doMethodInvoke(MetaMethod.java:323)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1268)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:1035)\r\n\tat groovy.lang.MetaClassImpl.invokeMethod(MetaClassImpl.java:819)\r\n\tat groovy.lang.GroovyObject.invokeMethod(GroovyObject.java:39)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.call(PogoInterceptableSite.java:45)\r\n\tat org.codehaus.groovy.runtime.callsite.PogoInterceptableSite.callCurrent(PogoInterceptableSite.java:55)\r\n\tat org.codehaus.groovy.runtime.callsite.CallSiteArray.defaultCallCurrent(CallSiteArray.java:51)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:171)\r\n\tat org.codehaus.groovy.runtime.callsite.AbstractCallSite.callCurrent(AbstractCallSite.java:203)\r\n\tat io.restassured.internal.RequestSpecificationImpl.post(RequestSpecificationImpl.groovy:177)\r\n\tat io.restassured.internal.RequestSpecificationImpl.post(RequestSpecificationImpl.groovy)\r\n\tat stepdefs.core.ShipperOrderCreationSteps.shipperAuthenticatesToNinjaVan(ShipperOrderCreationSteps.java:37)\r\n\tat ✽.shipper authenticates to the Ninja Van system(src/main/resources/feature/OrderCreation/ShipperOrderCreation.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "QA verifies that the HTTP response code is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "ShipperOrderCreationSteps.verifyHttpResponseCode(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "shipper retrieves its access token",
  "keyword": "When "
});
formatter.match({
  "location": "ShipperOrderCreationSteps.retrieveAccessToken()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "shipper sends an order create request",
  "keyword": "And "
});
formatter.match({
  "location": "ShipperOrderCreationSteps.sendOrderCreateRequest()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "shipper provides the access token in the request header",
  "keyword": "And "
});
formatter.match({
  "location": "ShipperOrderCreationSteps.provideAccessTokenInRequestHeader()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "QA verifies that the HTTP response code is 200",
  "keyword": "Then "
});
formatter.match({
  "location": "ShipperOrderCreationSteps.verifyHttpResponseCode(int)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "QA verifies that the HTTP response body is \"status:\"",
  "keyword": "And "
});
formatter.match({
  "location": "ShipperOrderCreationSteps.verifyOrderCreateResponseBody(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat java.util.Objects.requireNonNull(Unknown Source)\r\n\tat org.openqa.selenium.support.ui.FluentWait.\u003cinit\u003e(FluentWait.java:106)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:85)\r\n\tat org.openqa.selenium.support.ui.WebDriverWait.\u003cinit\u003e(WebDriverWait.java:45)\r\n\tat elems.BaseElem.findElem(BaseElem.java:289)\r\n\tat pages.core.GlobalNavigation.clickOnGlbNavCmd(GlobalNavigation.java:95)\r\n\tat pages.core.GlobalNavigation.getSyslog(GlobalNavigation.java:646)\r\n\tat stepdefs.core.StepDefinitions.ScenarioDTO(StepDefinitions.java:2166)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:26)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:20)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.HookDefinitionMatch.runStep(HookDefinitionMatch.java:14)\r\n\tat cucumber.runner.TestStep.executeStep(TestStep.java:55)\r\n\tat cucumber.runner.TestStep.run(TestStep.java:42)\r\n\tat cucumber.runner.TestCase.run(TestCase.java:53)\r\n\tat cucumber.runner.Runner.runPickle(Runner.java:44)\r\n\tat cucumber.runtime.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:140)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:68)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:23)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:73)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:98)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:55)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat cucumber.api.junit.Cucumber$1.evaluate(Cucumber.java:107)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206)\r\n",
  "status": "failed"
});
});