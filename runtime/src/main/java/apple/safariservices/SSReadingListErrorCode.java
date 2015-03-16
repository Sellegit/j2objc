package apple.safariservices;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("SafariServices/SafariServices.h")
@Mapping("SSReadingListErrorCode")
public final class SSReadingListErrorCode extends ObjCEnum {
    
    @GlobalConstant("SSReadingListErrorURLSchemeNotAllowed")
    public static final long URLSchemeNotAllowed = 1L;
    

}
