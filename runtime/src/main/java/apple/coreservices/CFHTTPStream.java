package apple.coreservices;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("CFNetwork/CFNetwork.h")
public class CFHTTPStream 
    extends CFReadStream 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFReadStreamCreateForHTTPRequest")
    protected static native CFReadStream create(CFAllocator alloc, CFHTTPMessage request);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFReadStreamCreateForStreamedHTTPRequest")
    protected static native CFReadStream create(CFAllocator alloc, CFHTTPMessage requestHeaders, CFReadStream requestBody);
    
}
