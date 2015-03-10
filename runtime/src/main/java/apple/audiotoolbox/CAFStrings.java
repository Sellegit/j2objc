package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;





@Mapping("CAFStrings")
public class CAFStrings 
    extends Struct 
     {

    
    protected CAFStrings() {}
    
    
    @DotMapping("mNumEntries")
    public native int getMNumEntries();
    @DotMapping("mStringsIDs")
    public native CAFStringID getMStringsIDs();
    
    public static native CAFStrings create(int mNumEntries, CAFStringID mStringsIDs) /*-[
        CAFStrings __new = { .mNumEntries = mNumEntries, .mStringsIDs = mStringsIDs };
        return __new;
    ]-*/;
    public static native CAFStrings copyWithmNumEntries(CAFStrings original, int mNumEntries) /*-[
        original.mNumEntries = mNumEntries;
        return __new;
    ]-*/;

    
    public static native CAFStrings copyWithmStringsIDs(CAFStrings original, CAFStringID mStringsIDs) /*-[
        original.mStringsIDs = mStringsIDs;
        return __new;
    ]-*/;

    
}
