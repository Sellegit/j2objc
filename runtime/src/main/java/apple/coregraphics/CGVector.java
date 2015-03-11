package apple.coregraphics;


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
import apple.uikit.*;





@Mapping("CGVector")
public class CGVector 
    extends Struct 
     {

    
    protected CGVector() {}
    
    
    @DotMapping("dx")
    public native @MachineSizedFloat double getDx();
    @DotMapping("dy")
    public native @MachineSizedFloat double getDy();
    
    public static native CGVector create(@MachineSizedFloat double dx, @MachineSizedFloat double dy) /*-[
        CGVector __new = { .dx = dx, .dy = dy };
        return __new;
    ]-*/;
    public static native CGVector copyWithdx(CGVector original, @MachineSizedFloat double dx) /*-[
        original.dx = dx;
        return __new;
    ]-*/;

    
    public static native CGVector copyWithdy(CGVector original, @MachineSizedFloat double dy) /*-[
        original.dy = dy;
        return __new;
    ]-*/;

    
}
