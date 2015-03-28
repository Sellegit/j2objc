package apple.coremedia;


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
import apple.coreaudio.*;
import apple.coreanimation.*;
import apple.corevideo.*;


@Mapping("CMVideoDimensions") @Library("CoreMedia/CoreMedia.h")
public class CMVideoDimensions 
    extends Struct 
     {

    
    private CMVideoDimensions() {}
    
    
    @DotMapping("width")
    public native int getWidth();
    @DotMapping("height")
    public native int getHeight();

    public static native CMVideoDimensions create(int width, int height) /*-[
        CMVideoDimensions __new = { .width = width, .height = height };
        return __new;
    ]-*/;
    public static native CMVideoDimensions copyWithwidth(CMVideoDimensions original, int width) /*-[
        CMVideoDimensions __new = { .width = width, .height = original.height };
        return __new;
    ]-*/;


    public static native CMVideoDimensions copyWithheight(CMVideoDimensions original, int height) /*-[
        CMVideoDimensions __new = { .width = original.width, .height = height };
        return __new;
    ]-*/;


    public static final class Adapter {

        public int width;
        public int height;
        public Adapter(int width, int height) {
            this.width = width;
            this.height = height;
        }
        public Adapter(CMVideoDimensions original) {
            this.width = original.getWidth();
            this.height = original.getHeight();
        }
        public CMVideoDimensions convert() {
            return create(width, height);
        }
    }
}
