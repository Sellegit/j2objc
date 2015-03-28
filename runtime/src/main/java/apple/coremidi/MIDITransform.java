package apple.coremidi;


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


@Mapping("MIDITransform") @Library("CoreMIDI/CoreMIDI.h")
public class MIDITransform 
    extends Struct 
     {

    
    private MIDITransform() {}
    
    
    @DotMapping("transform")
    public native MIDITransformType getTransform();
    @DotMapping("param")
    public native short getParam();

    public static native MIDITransform create(MIDITransformType transform, short param) /*-[
        MIDITransform __new = { .transform = transform, .param = param };
        return __new;
    ]-*/;
    public static native MIDITransform copyWithtransform(MIDITransform original, MIDITransformType transform) /*-[
        MIDITransform __new = { .transform = transform, .param = original.param };
        return __new;
    ]-*/;


    public static native MIDITransform copyWithparam(MIDITransform original, short param) /*-[
        MIDITransform __new = { .transform = original.transform, .param = param };
        return __new;
    ]-*/;


    public static final class Adapter {

        public MIDITransformType transform;
        public short param;
        public Adapter(MIDITransformType transform, short param) {
            this.transform = transform;
            this.param = param;
        }
        public Adapter(MIDITransform original) {
            this.transform = original.getTransform();
            this.param = original.getParam();
        }
        public MIDITransform convert() {
            return create(transform, param);
        }
    }
}
