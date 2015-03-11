package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;





@Mapping("AVPixelAspectRatio")
public class AVPixelAspectRatio 
    extends Struct 
     {

    
    protected AVPixelAspectRatio() {}
    
    
    @DotMapping("horizontalSpacing")
    public native @MachineSizedSInt long getHorizontalSpacing();
    @DotMapping("verticalSpacing")
    public native @MachineSizedSInt long getVerticalSpacing();
    
    public static native AVPixelAspectRatio create(@MachineSizedSInt long horizontalSpacing, @MachineSizedSInt long verticalSpacing) /*-[
        AVPixelAspectRatio __new = { .horizontalSpacing = horizontalSpacing, .verticalSpacing = verticalSpacing };
        return __new;
    ]-*/;
    public static native AVPixelAspectRatio copyWithhorizontalSpacing(AVPixelAspectRatio original, @MachineSizedSInt long horizontalSpacing) /*-[
        original.horizontalSpacing = horizontalSpacing;
        return __new;
    ]-*/;

    
    public static native AVPixelAspectRatio copyWithverticalSpacing(AVPixelAspectRatio original, @MachineSizedSInt long verticalSpacing) /*-[
        original.verticalSpacing = verticalSpacing;
        return __new;
    ]-*/;

    
}
