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





@Mapping("NSOperatingSystemVersion")
public class NSOperatingSystemVersion 
    extends Struct 
     {

    
    protected NSOperatingSystemVersion() {}
    
    
    @DotMapping("majorVersion")
    public native @MachineSizedSInt long getMajorVersion();
    @DotMapping("minorVersion")
    public native @MachineSizedSInt long getMinorVersion();
    @DotMapping("patchVersion")
    public native @MachineSizedSInt long getPatchVersion();
    
    public static native NSOperatingSystemVersion create(@MachineSizedSInt long majorVersion, @MachineSizedSInt long minorVersion, @MachineSizedSInt long patchVersion) /*-[
        NSOperatingSystemVersion __new = { .majorVersion = majorVersion, .minorVersion = minorVersion, .patchVersion = patchVersion };
        return __new;
    ]-*/;
    public static native NSOperatingSystemVersion copyWithmajorVersion(NSOperatingSystemVersion original, @MachineSizedSInt long majorVersion) /*-[
        original.majorVersion = majorVersion;
        return __new;
    ]-*/;

    
    public static native NSOperatingSystemVersion copyWithminorVersion(NSOperatingSystemVersion original, @MachineSizedSInt long minorVersion) /*-[
        original.minorVersion = minorVersion;
        return __new;
    ]-*/;

    
    public static native NSOperatingSystemVersion copyWithpatchVersion(NSOperatingSystemVersion original, @MachineSizedSInt long patchVersion) /*-[
        original.patchVersion = patchVersion;
        return __new;
    ]-*/;

    
}
