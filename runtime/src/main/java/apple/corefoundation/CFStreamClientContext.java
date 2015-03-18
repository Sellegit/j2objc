package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;





@Mapping("CFStreamClientContext") @Library("CoreFoundation/CoreFoundation.h")
public class CFStreamClientContext 
    extends Struct 
     {

    
    private CFStreamClientContext() {}
    
    
    @DotMapping("version")
    public native @MachineSizedSInt long getVersion();
    
    
}
