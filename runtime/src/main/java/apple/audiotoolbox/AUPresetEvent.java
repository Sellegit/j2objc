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





@Mapping("AUPresetEvent") @Library("AudioToolbox/AudioToolbox.h")
public class AUPresetEvent 
    extends Struct 
     {

    
    protected AUPresetEvent() {}
    
    
    @DotMapping("scope")
    public native int getScope();
    @DotMapping("element")
    public native int getElement();
    @DotMapping("preset")
    public native CFType getPreset();
    
    public static native AUPresetEvent create(int scope, int element, CFType preset) /*-[
        AUPresetEvent __new = { .scope = scope, .element = element, .preset = preset };
        return __new;
    ]-*/;
    public static native AUPresetEvent copyWithscope(AUPresetEvent original, int scope) /*-[
        AUPresetEvent __new = { .scope = scope, .element = original.element, .preset = original.preset };
        return __new;
    ]-*/;

    
    public static native AUPresetEvent copyWithelement(AUPresetEvent original, int element) /*-[
        AUPresetEvent __new = { .scope = original.scope, .element = element, .preset = original.preset };
        return __new;
    ]-*/;

    
    public static native AUPresetEvent copyWithpreset(AUPresetEvent original, CFType preset) /*-[
        AUPresetEvent __new = { .scope = original.scope, .element = original.element, .preset = preset };
        return __new;
    ]-*/;

    
}
