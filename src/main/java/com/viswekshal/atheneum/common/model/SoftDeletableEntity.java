package com.viswekshal.atheneum.common.model;

import java.util.function.Function;

public interface SoftDeletableEntity {

    String getId();

    String getProjectId();

    String getTableName();

    String getConnectionId();

    void markDeleted(Function<String, String> nameGen);
}