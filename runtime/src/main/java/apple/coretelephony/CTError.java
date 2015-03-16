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





@Mapping("CTError") @Library("CoreTelephony/CoreTelephony.h")
public class CTError 
    extends Struct 
     {

    
    protected CTError() {}
    
    
    @DotMapping("domain")
    public native CTErrorDomain getDomain();
    @DotMapping("error")
    public native int getErrorCode();
    
    public static native CTError create(CTErrorDomain domain, int errorCode) /*-[
        CTError __new = { .domain = domain, .error = error };
        return __new;
    ]-*/;
    public static native CTError copyWithdomain(CTError original, CTErrorDomain domain) /*-[
        original.domain = domain;
        return original;
    ]-*/;

    
    public static native CTError copyWitherror(CTError original, int error) /*-[
        original.error = error;
        return original;
    ]-*/;

    
}
