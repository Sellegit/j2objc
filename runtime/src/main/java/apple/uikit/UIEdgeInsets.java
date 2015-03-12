package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;





@Mapping("UIEdgeInsets") @Library("UIKit")
public class UIEdgeInsets 
    extends Struct 
     {

    
    protected UIEdgeInsets() {}
    
    
    @DotMapping("top")
    public native @MachineSizedFloat double getTop();
    @DotMapping("left")
    public native @MachineSizedFloat double getLeft();
    @DotMapping("bottom")
    public native @MachineSizedFloat double getBottom();
    @DotMapping("right")
    public native @MachineSizedFloat double getRight();
    
    public static native UIEdgeInsets create(@MachineSizedFloat double top, @MachineSizedFloat double left, @MachineSizedFloat double bottom, @MachineSizedFloat double right) /*-[
        UIEdgeInsets __new = { .top = top, .left = left, .bottom = bottom, .right = right };
        return __new;
    ]-*/;
    public static native UIEdgeInsets copyWithtop(UIEdgeInsets original, @MachineSizedFloat double top) /*-[
        original.top = top;
        return original;
    ]-*/;

    
    public static native UIEdgeInsets copyWithleft(UIEdgeInsets original, @MachineSizedFloat double left) /*-[
        original.left = left;
        return original;
    ]-*/;

    
    public static native UIEdgeInsets copyWithbottom(UIEdgeInsets original, @MachineSizedFloat double bottom) /*-[
        original.bottom = bottom;
        return original;
    ]-*/;

    
    public static native UIEdgeInsets copyWithright(UIEdgeInsets original, @MachineSizedFloat double right) /*-[
        original.right = right;
        return original;
    ]-*/;

    
    @GlobalConstant("UIEdgeInsetsZero")
    public static native UIEdgeInsets Zero();
    
    @GlobalFunction("NSStringFromUIEdgeInsets")
    protected static native String toString(UIEdgeInsets insets);
    @GlobalFunction("UIEdgeInsetsFromString")
    public static native UIEdgeInsets fromString(String string);
    
}
