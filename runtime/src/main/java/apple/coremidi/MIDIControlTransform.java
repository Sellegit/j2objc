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


@Mapping("MIDIControlTransform") @Library("CoreMIDI/CoreMIDI.h")
public class MIDIControlTransform 
    extends Struct 
     {

    
    private MIDIControlTransform() {}
    
    
    @DotMapping("controlType")
    public native MIDITransformControlType getControlType();
    @DotMapping("remappedControlType")
    public native MIDITransformControlType getRemappedControlType();
    @DotMapping("controlNumber")
    public native short getControlNumber();
    @DotMapping("transform")
    public native MIDITransformType getTransform();
    @DotMapping("param")
    public native short getParam();

    public static native MIDIControlTransform create(MIDITransformControlType controlType, MIDITransformControlType remappedControlType, short controlNumber, MIDITransformType transform, short param) /*-[
        MIDIControlTransform __new = { .controlType = controlType, .remappedControlType = remappedControlType, .controlNumber = controlNumber, .transform = transform, .param = param };
        return __new;
    ]-*/;
    public static native MIDIControlTransform copyWithcontrolType(MIDIControlTransform original, MIDITransformControlType controlType) /*-[
        MIDIControlTransform __new = { .controlType = controlType, .remappedControlType = original.remappedControlType, .controlNumber = original.controlNumber, .transform = original.transform, .param = original.param };
        return __new;
    ]-*/;


    public static native MIDIControlTransform copyWithremappedControlType(MIDIControlTransform original, MIDITransformControlType remappedControlType) /*-[
        MIDIControlTransform __new = { .controlType = original.controlType, .remappedControlType = remappedControlType, .controlNumber = original.controlNumber, .transform = original.transform, .param = original.param };
        return __new;
    ]-*/;


    public static native MIDIControlTransform copyWithcontrolNumber(MIDIControlTransform original, short controlNumber) /*-[
        MIDIControlTransform __new = { .controlType = original.controlType, .remappedControlType = original.remappedControlType, .controlNumber = controlNumber, .transform = original.transform, .param = original.param };
        return __new;
    ]-*/;


    public static native MIDIControlTransform copyWithtransform(MIDIControlTransform original, MIDITransformType transform) /*-[
        MIDIControlTransform __new = { .controlType = original.controlType, .remappedControlType = original.remappedControlType, .controlNumber = original.controlNumber, .transform = transform, .param = original.param };
        return __new;
    ]-*/;


    public static native MIDIControlTransform copyWithparam(MIDIControlTransform original, short param) /*-[
        MIDIControlTransform __new = { .controlType = original.controlType, .remappedControlType = original.remappedControlType, .controlNumber = original.controlNumber, .transform = original.transform, .param = param };
        return __new;
    ]-*/;


    public static final class Adapter {

        public MIDITransformControlType controlType;
        public MIDITransformControlType remappedControlType;
        public short controlNumber;
        public MIDITransformType transform;
        public short param;
        public Adapter(MIDITransformControlType controlType, MIDITransformControlType remappedControlType, short controlNumber, MIDITransformType transform, short param) {
            this.controlType = controlType;
            this.remappedControlType = remappedControlType;
            this.controlNumber = controlNumber;
            this.transform = transform;
            this.param = param;
        }
        public Adapter(MIDIControlTransform original) {
            this.controlType = original.getControlType();
            this.remappedControlType = original.getRemappedControlType();
            this.controlNumber = original.getControlNumber();
            this.transform = original.getTransform();
            this.param = original.getParam();
        }
        public MIDIControlTransform convert() {
            return create(controlType, remappedControlType, controlNumber, transform, param);
        }
    }
}
