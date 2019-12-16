package com.hortonworks.registries.schemaregistry.client;

public interface RetryPolicy {

    RetryPolicyOutput checkIfRetryRequired(RetryPolicyInput input);
}
