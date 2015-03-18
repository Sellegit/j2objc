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





@Mapping("CFHostClientContext") @Library("CFNetwork/CFNetwork.h")
 class CFHostClientContext 
    extends Struct 
     {

    
    private CFHostClientContext() {}
    
    
    @DotMapping("version")
    public native @MachineSizedSInt long getVersion();
    
    
}
