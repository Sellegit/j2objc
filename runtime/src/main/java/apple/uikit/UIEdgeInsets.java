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


@Mapping("UIEdgeInsets") @Library("UIKit/UIKit.h")
public class UIEdgeInsets 
    extends Struct 
     {

    
    private UIEdgeInsets() {}
    
    
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
        UIEdgeInsets __new = { .top = top, .left = original.left, .bottom = original.bottom, .right = original.right };
        return __new;
    ]-*/;


    public static native UIEdgeInsets copyWithleft(UIEdgeInsets original, @MachineSizedFloat double left) /*-[
        UIEdgeInsets __new = { .top = original.top, .left = left, .bottom = original.bottom, .right = original.right };
        return __new;
    ]-*/;


    public static native UIEdgeInsets copyWithbottom(UIEdgeInsets original, @MachineSizedFloat double bottom) /*-[
        UIEdgeInsets __new = { .top = original.top, .left = original.left, .bottom = bottom, .right = original.right };
        return __new;
    ]-*/;


    public static native UIEdgeInsets copyWithright(UIEdgeInsets original, @MachineSizedFloat double right) /*-[
        UIEdgeInsets __new = { .top = original.top, .left = original.left, .bottom = original.bottom, .right = right };
        return __new;
    ]-*/;


    public static final class Adapter {

        public @MachineSizedFloat double top;
        public @MachineSizedFloat double left;
        public @MachineSizedFloat double bottom;
        public @MachineSizedFloat double right;
        public Adapter(@MachineSizedFloat double top, @MachineSizedFloat double left, @MachineSizedFloat double bottom, @MachineSizedFloat double right) {
            this.top = top;
            this.left = left;
            this.bottom = bottom;
            this.right = right;
        }
        public Adapter(UIEdgeInsets original) {
            this.top = original.getTop();
            this.left = original.getLeft();
            this.bottom = original.getBottom();
            this.right = original.getRight();
        }
        public UIEdgeInsets convert() {
            return create(top, left, bottom, right);
        }
    }
    @GlobalConstant("UIEdgeInsetsZero")
    public static native UIEdgeInsets Zero();

    @GlobalFunction("NSStringFromUIEdgeInsets")
    public static native String toString(UIEdgeInsets insets);
    @GlobalFunction("UIEdgeInsetsFromString")
    public static native UIEdgeInsets fromString(String string);

}
