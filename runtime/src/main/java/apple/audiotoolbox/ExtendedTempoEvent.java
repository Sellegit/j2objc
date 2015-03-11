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





@Mapping("ExtendedTempoEvent")
public class ExtendedTempoEvent 
    extends Struct 
     {

    
    protected ExtendedTempoEvent() {}
    
    
    @DotMapping("bpm")
    public native double getBpm();
    
    public static native ExtendedTempoEvent create(double bpm) /*-[
        ExtendedTempoEvent __new = { .bpm = bpm };
        return __new;
    ]-*/;
    public static native ExtendedTempoEvent copyWithbpm(ExtendedTempoEvent original, double bpm) /*-[
        original.bpm = bpm;
        return __new;
    ]-*/;

    
}
