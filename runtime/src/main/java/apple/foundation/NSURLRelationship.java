package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("NSURLRelationship")
public final class NSURLRelationship extends ObjCEnum {
    
    @GlobalConstant("NSURLRelationshipContains")
    public static final long Contains = 0L;
    @GlobalConstant("NSURLRelationshipSame")
    public static final long Same = 1L;
    @GlobalConstant("NSURLRelationshipOther")
    public static final long Other = 2L;
    

}
