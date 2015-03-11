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





@Mapping("NSRange") @Library("Foundation")
public class NSRange 
    extends Struct 
     {

    
    protected NSRange() {}
    
    
    @DotMapping("location")
    public native @MachineSizedUInt long getLocation();
    @DotMapping("length")
    public native @MachineSizedUInt long getLength();
    
    public static native NSRange create(@MachineSizedUInt long location, @MachineSizedUInt long length) /*-[
        NSRange __new = { .location = location, .length = length };
        return __new;
    ]-*/;
    public static native NSRange copyWithlocation(NSRange original, @MachineSizedUInt long location) /*-[
        original.location = location;
        return __new;
    ]-*/;

    
    public static native NSRange copyWithlength(NSRange original, @MachineSizedUInt long length) /*-[
        original.length = length;
        return __new;
    ]-*/;

    
    @GlobalFunction("NSUnionRange")
    public static native NSRange union(NSRange range1, NSRange range2);
    @GlobalFunction("NSIntersectionRange")
    public static native NSRange intersection(NSRange range1, NSRange range2);
    @GlobalFunction("NSStringFromRange")
    protected static native String toString(NSRange range);
    @GlobalFunction("NSRangeFromString")
    public static native NSRange fromString(String aString);
    
}
