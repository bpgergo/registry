/*
 * Copyright 2016-2019 Cloudera, Inc.
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

package com.hortonworks.registries.schemaregistry.client;

import javax.ws.rs.client.WebTarget;
import java.util.Objects;

public class RetryPolicyOutput {

    private boolean shouldExecute = false;

    private WebTarget target;

    public RetryPolicyOutput(boolean shouldExecute) {
        this.shouldExecute = shouldExecute;
    }

    public RetryPolicyOutput(boolean shouldExecute, WebTarget target) {
        this.shouldExecute = shouldExecute;
        this.target = target;
    }

    public boolean shouldExecute() {
        return shouldExecute;
    }

    public WebTarget target() {
        return target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RetryPolicyOutput that = (RetryPolicyOutput) o;
        return shouldExecute == that.shouldExecute &&
                Objects.equals(target, that.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shouldExecute, target);
    }

    @Override
    public String toString() {
        return "RetryPolicyOutput{" +
                "shouldExecute=" + shouldExecute +
                ", target=" + target +
                '}';
    }
}
