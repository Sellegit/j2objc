package apple.coremotion;


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


@Mapping("CMCalibratedMagneticField") @Library("CoreMotion/CoreMotion.h")
public class CMCalibratedMagneticField 
    extends Struct 
     {

    
    private CMCalibratedMagneticField() {}
    
    
    @DotMapping("field")
    public native CMMagneticField getField();
    @DotMapping("accuracy")
    public native CMMagneticFieldCalibrationAccuracy getAccuracy();

    public static native CMCalibratedMagneticField create(CMMagneticField field, CMMagneticFieldCalibrationAccuracy accuracy) /*-[
        CMCalibratedMagneticField __new = { .field = field, .accuracy = accuracy };
        return __new;
    ]-*/;
    public static native CMCalibratedMagneticField copyWithfield(CMCalibratedMagneticField original, CMMagneticField field) /*-[
        CMCalibratedMagneticField __new = { .field = field, .accuracy = original.accuracy };
        return __new;
    ]-*/;


    public static native CMCalibratedMagneticField copyWithaccuracy(CMCalibratedMagneticField original, CMMagneticFieldCalibrationAccuracy accuracy) /*-[
        CMCalibratedMagneticField __new = { .field = original.field, .accuracy = accuracy };
        return __new;
    ]-*/;


    public static final class Adapter {

        public CMMagneticField field;
        public CMMagneticFieldCalibrationAccuracy accuracy;
        public Adapter(CMMagneticField field, CMMagneticFieldCalibrationAccuracy accuracy) {
            this.field = field;
            this.accuracy = accuracy;
        }
        public Adapter(CMCalibratedMagneticField original) {
            this.field = original.getField();
            this.accuracy = original.getAccuracy();
        }
        public CMCalibratedMagneticField convert() {
            return create(field, accuracy);
        }
    }
}
