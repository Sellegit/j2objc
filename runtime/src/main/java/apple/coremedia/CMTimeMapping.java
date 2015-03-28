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


@Mapping("CMTimeMapping") @Library("CoreMedia/CoreMedia.h")
public class CMTimeMapping 
    extends Struct 
     {

    
    private CMTimeMapping() {}
    
    
    @DotMapping("source")
    public native CMTimeRange getSource();
    @DotMapping("target")
    public native CMTimeRange getTarget();

    public static native CMTimeMapping create(CMTimeRange source, CMTimeRange target) /*-[
        CMTimeMapping __new = { .source = source, .target = target };
        return __new;
    ]-*/;
    public static native CMTimeMapping copyWithsource(CMTimeMapping original, CMTimeRange source) /*-[
        CMTimeMapping __new = { .source = source, .target = original.target };
        return __new;
    ]-*/;


    public static native CMTimeMapping copyWithtarget(CMTimeMapping original, CMTimeRange target) /*-[
        CMTimeMapping __new = { .source = original.source, .target = target };
        return __new;
    ]-*/;


    public static final class Adapter {

        public CMTimeRange source;
        public CMTimeRange target;
        public Adapter(CMTimeRange source, CMTimeRange target) {
            this.source = source;
            this.target = target;
        }
        public Adapter(CMTimeMapping original) {
            this.source = original.getSource();
            this.target = original.getTarget();
        }
        public CMTimeMapping convert() {
            return create(source, target);
        }
    }
}
