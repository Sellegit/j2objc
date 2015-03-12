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





@Mapping("AVEdgeWidths")
public class AVEdgeWidths 
    extends Struct 
     {

    
    protected AVEdgeWidths() {}
    
    
    @DotMapping("left")
    public native @MachineSizedFloat double getLeft();
    @DotMapping("top")
    public native @MachineSizedFloat double getTop();
    @DotMapping("right")
    public native @MachineSizedFloat double getRight();
    @DotMapping("bottom")
    public native @MachineSizedFloat double getBottom();
    
    public static native AVEdgeWidths create(@MachineSizedFloat double left, @MachineSizedFloat double top, @MachineSizedFloat double right, @MachineSizedFloat double bottom) /*-[
        AVEdgeWidths __new = { .left = left, .top = top, .right = right, .bottom = bottom };
        return __new;
    ]-*/;
    public static native AVEdgeWidths copyWithleft(AVEdgeWidths original, @MachineSizedFloat double left) /*-[
        original.left = left;
        return original;
    ]-*/;

    
    public static native AVEdgeWidths copyWithtop(AVEdgeWidths original, @MachineSizedFloat double top) /*-[
        original.top = top;
        return original;
    ]-*/;

    
    public static native AVEdgeWidths copyWithright(AVEdgeWidths original, @MachineSizedFloat double right) /*-[
        original.right = right;
        return original;
    ]-*/;

    
    public static native AVEdgeWidths copyWithbottom(AVEdgeWidths original, @MachineSizedFloat double bottom) /*-[
        original.bottom = bottom;
        return original;
    ]-*/;

    
}
