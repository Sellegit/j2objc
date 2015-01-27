/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.google.j2objc.security;

import java.io.ByteArrayOutputStream;
import java.security.MessageDigest;

/*-[
#import "CommonCrypto/CommonDigest.h"
]-*/

/**
 * Secure hash algorithm (SHA) message digest, which is implemented using
 * the iOS Security Library.
 *
 * @author Tom Ball
 */
public abstract class IosSHAMessageDigest extends MessageDigest {

  protected ByteArrayOutputStream buffer;

  public IosSHAMessageDigest(String algorithm) {
    super(algorithm);
    buffer = new ByteArrayOutputStream();
  }

  @Override
  protected void engineUpdate(byte input) {
    buffer.write(input);
  }

  @Override
  protected void engineUpdate(byte[] input, int offset, int len) {
    buffer.write(input, offset, len);
  }

  @Override
  protected void engineReset() {
    buffer.reset();
  }

  public static class SHA1 extends IosSHAMessageDigest {

    public SHA1() {
      super("SHA1");
    }

    @Override
    protected native byte[] engineDigest() /*-[
      IOSByteArray *bytes = [buffer_ toByteArray];
      unsigned char digest[CC_SHA1_DIGEST_LENGTH];
      CC_SHA1(bytes->buffer_, bytes->size_, digest);
      return [IOSByteArray arrayWithBytes:(jbyte *)digest count:CC_SHA1_DIGEST_LENGTH];
    ]-*/;

    @Override
    protected native int engineGetDigestLength() /*-[
      return CC_SHA1_DIGEST_LENGTH;
    ]-*/;
  }

  public static class SHA256 extends IosSHAMessageDigest {

    public SHA256() {
      super("SHA256");
    }

    @Override
    protected native byte[] engineDigest() /*-[
      IOSByteArray *bytes = [buffer_ toByteArray];
      unsigned char digest[CC_SHA256_DIGEST_LENGTH];
      CC_SHA256(bytes->buffer_, bytes->size_, digest);
      return [IOSByteArray arrayWithBytes:(jbyte *)digest count:CC_SHA256_DIGEST_LENGTH];
    ]-*/;

    @Override
    protected native int engineGetDigestLength() /*-[
      return CC_SHA256_DIGEST_LENGTH;
    ]-*/;
  }

  public static class SHA384 extends IosSHAMessageDigest {

    public SHA384() {
      super("SHA384");
    }

    @Override
    protected native byte[] engineDigest() /*-[
      IOSByteArray *bytes = [buffer_ toByteArray];
      unsigned char digest[CC_SHA384_DIGEST_LENGTH];
      CC_SHA384(bytes->buffer_, bytes->size_, digest);
      return [IOSByteArray arrayWithBytes:(jbyte *)digest count:CC_SHA384_DIGEST_LENGTH];
    ]-*/;

    @Override
    protected native int engineGetDigestLength() /*-[
      return CC_SHA384_DIGEST_LENGTH;
    ]-*/;
  }

  public static class SHA512 extends IosSHAMessageDigest {

    public SHA512() {
      super("SHA512");
    }

    @Override
    protected native byte[] engineDigest() /*-[
      IOSByteArray *bytes = [buffer_ toByteArray];
      unsigned char digest[CC_SHA512_DIGEST_LENGTH];
      CC_SHA512(bytes->buffer_, bytes->size_, digest);
      return [IOSByteArray arrayWithBytes:(jbyte *)digest count:CC_SHA512_DIGEST_LENGTH];
    ]-*/;

    @Override
    protected native int engineGetDigestLength() /*-[
      return CC_SHA512_DIGEST_LENGTH;
    ]-*/;
  }
}
