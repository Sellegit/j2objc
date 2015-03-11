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





@Mapping("CAFInfoStrings")
public class CAFInfoStrings 
    extends Struct 
     {

    
    protected CAFInfoStrings() {}
    
    
    @DotMapping("mNumEntries")
    public native int getMNumEntries();
    
    public static native CAFInfoStrings create(int mNumEntries) /*-[
        CAFInfoStrings __new = { .mNumEntries = mNumEntries };
        return __new;
    ]-*/;
    public static native CAFInfoStrings copyWithmNumEntries(CAFInfoStrings original, int mNumEntries) /*-[
        original.mNumEntries = mNumEntries;
        return __new;
    ]-*/;

    
}
