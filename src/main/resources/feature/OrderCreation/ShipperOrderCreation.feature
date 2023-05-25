Feature: Shipper Order Creation

Scenario: Shipper creates an order in Ninja Van

Given the shipper is registered in Ninja Van

When shipper authenticates to the Ninja Van system

Then QA verifies that the HTTP response code is 200

When shipper retrieves its access token

And shipper sends an order create request

And shipper provides the access token in the request header

Then QA verifies that the HTTP response code is 200

And QA verifies that the HTTP response body is "status:"