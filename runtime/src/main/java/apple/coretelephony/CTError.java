package apple.coretelephony;


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





@Mapping("CTError") @Library("CoreTelephony/CTCall.h")
public class CTError 
    extends Struct 
     {

    
    private CTError() {}
    
    
    @DotMapping("domain")
    public native CTErrorDomain getDomain();
    @DotMapping("error")
    public native int getErrorCode();
    
    
}
