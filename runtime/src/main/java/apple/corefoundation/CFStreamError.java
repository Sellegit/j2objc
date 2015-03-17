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





@Mapping("CFStreamError") @Library("CoreFoundation/CoreFoundation.h")
public class CFStreamError 
    extends Struct 
     {

    
    protected CFStreamError() {}
    
    
    @DotMapping("domain")
    public native CFStreamErrorDomain getDomain();
    @DotMapping("error")
    public native int getError();
    
    public static native CFStreamError create(CFStreamErrorDomain domain, int error) /*-[
        CFStreamError __new = { .domain = domain, .error = error };
        return __new;
    ]-*/;
    public static native CFStreamError copyWithdomain(CFStreamError original, CFStreamErrorDomain domain) /*-[
        CFStreamError __new = { .domain = domain, .error = original.error };
        return __new;
    ]-*/;

    
    public static native CFStreamError copyWitherror(CFStreamError original, int error) /*-[
        CFStreamError __new = { .domain = original.domain, .error = error };
        return __new;
    ]-*/;

    
}
