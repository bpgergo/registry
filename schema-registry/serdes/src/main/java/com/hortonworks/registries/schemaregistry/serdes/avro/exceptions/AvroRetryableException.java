/*
 * Copyright 2017-2019 Cloudera, Inc.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hortonworks.registries.schemaregistry.serdes.avro.exceptions;

import com.hortonworks.registries.schemaregistry.serde.RetryableException;

/**
 * This is thrown when an exception is caused due to Avro to binary (or vice versa) conversion, 
 * and the exception is deemed retry-able, e.g. cause being IOException.
 */
public class AvroRetryableException extends AvroException implements RetryableException {

   public AvroRetryableException() {
   }

   public AvroRetryableException(String message) {
      super(message);
   }

   public AvroRetryableException(String message, Throwable cause) {
      super(message, cause);
   }

   public AvroRetryableException(Throwable cause) {
      super(cause);
   }

   public AvroRetryableException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
      super(message, cause, enableSuppression, writableStackTrace);
   }
   
}
