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
@Mapping("CFNetDiagnosticRef") @Library("CFNetwork/CFNetwork.h")
public class CFNetDiagnostic 
    extends CFType 
     {

    
    
    protected CFNetDiagnostic() {}

    
    
    
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetDiagnosticCreateWithStreams")
    public static native CFNetDiagnostic create(CFAllocator alloc, CFReadStream readStream, CFWriteStream writeStream);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetDiagnosticCreateWithURL")
    public static native CFNetDiagnostic create(CFAllocator alloc, CFURL url);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetDiagnosticSetName")
    public static native void setName(CFNetDiagnostic details, CFString name);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetDiagnosticDiagnoseProblemInteractively")
    public static native CFNetDiagnosticStatus diagnoseProblemInteractively(CFNetDiagnostic details);
    /**
     * @since Available in iOS 2.0 and later.
     */
    @GlobalFunction("CFNetDiagnosticCopyNetworkStatusPassively")
    public static native CFNetDiagnosticStatus getNetworkStatusPassively(CFNetDiagnostic details, Todo description);

}
