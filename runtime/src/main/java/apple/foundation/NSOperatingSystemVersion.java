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


@Mapping("NSOperatingSystemVersion") @Library("Foundation/Foundation.h")
public class NSOperatingSystemVersion 
    extends Struct 
     {

    
    private NSOperatingSystemVersion() {}
    
    
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
        NSOperatingSystemVersion __new = { .majorVersion = majorVersion, .minorVersion = original.minorVersion, .patchVersion = original.patchVersion };
        return __new;
    ]-*/;


    public static native NSOperatingSystemVersion copyWithminorVersion(NSOperatingSystemVersion original, @MachineSizedSInt long minorVersion) /*-[
        NSOperatingSystemVersion __new = { .majorVersion = original.majorVersion, .minorVersion = minorVersion, .patchVersion = original.patchVersion };
        return __new;
    ]-*/;


    public static native NSOperatingSystemVersion copyWithpatchVersion(NSOperatingSystemVersion original, @MachineSizedSInt long patchVersion) /*-[
        NSOperatingSystemVersion __new = { .majorVersion = original.majorVersion, .minorVersion = original.minorVersion, .patchVersion = patchVersion };
        return __new;
    ]-*/;


    public static final class Adapter {

        public @MachineSizedSInt long majorVersion;
        public @MachineSizedSInt long minorVersion;
        public @MachineSizedSInt long patchVersion;
        public Adapter(@MachineSizedSInt long majorVersion, @MachineSizedSInt long minorVersion, @MachineSizedSInt long patchVersion) {
            this.majorVersion = majorVersion;
            this.minorVersion = minorVersion;
            this.patchVersion = patchVersion;
        }
        public Adapter(NSOperatingSystemVersion original) {
            this.majorVersion = original.getMajorVersion();
            this.minorVersion = original.getMinorVersion();
            this.patchVersion = original.getPatchVersion();
        }
        public NSOperatingSystemVersion convert() {
            return create(majorVersion, minorVersion, patchVersion);
        }
    }
}
