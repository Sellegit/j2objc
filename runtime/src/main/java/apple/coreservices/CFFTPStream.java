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
@Library("CFNetwork")
public class CFFTPStream 
    extends Object 
     {

    
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFReadStreamCreateWithFTPURL")
    protected static native CFReadStream createReadStream(CFAllocator alloc, NSURL ftpURL);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFFTPCreateParsedResourceListing")
    protected static native @MachineSizedSInt long createParsedResourceListing(CFAllocator alloc, @Pointer long buffer, @MachineSizedSInt long bufferLength, Todo parsed);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFWriteStreamCreateWithFTPURL")
    protected static native CFWriteStream createWriteStream(CFAllocator alloc, NSURL ftpURL);
    
}
