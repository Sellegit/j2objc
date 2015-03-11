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
public class CFNetDiagnostic 
    extends CFType 
     {

    
    
    protected CFNetDiagnostic() {}
    
    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetDiagnosticCreateWithStreams")
    protected static native CFNetDiagnostic create(CFAllocator alloc, CFReadStream readStream, CFWriteStream writeStream);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetDiagnosticCreateWithURL")
    protected static native CFNetDiagnostic create(CFAllocator alloc, NSURL url);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetDiagnosticSetName")
    public native void setName(String name);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetDiagnosticDiagnoseProblemInteractively")
    public native CFNetDiagnosticStatus diagnoseProblemInteractively();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetDiagnosticCopyNetworkStatusPassively")
    protected native CFNetDiagnosticStatus getNetworkStatusPassively(Todo description);
    
}
