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

    
    protected CMCalibratedMagneticField() {}
    
    
    @DotMapping("field")
    public native CMMagneticField getField();
    @DotMapping("accuracy")
    public native CMMagneticFieldCalibrationAccuracy getAccuracy();
    
    public static native CMCalibratedMagneticField create(CMMagneticField field, CMMagneticFieldCalibrationAccuracy accuracy) /*-[
        CMCalibratedMagneticField __new = { .field = field, .accuracy = accuracy };
        return __new;
    ]-*/;
    public static native CMCalibratedMagneticField copyWithfield(CMCalibratedMagneticField original, CMMagneticField field) /*-[
        original.field = field;
        return original;
    ]-*/;

    
    public static native CMCalibratedMagneticField copyWithaccuracy(CMCalibratedMagneticField original, CMMagneticFieldCalibrationAccuracy accuracy) /*-[
        original.accuracy = accuracy;
        return original;
    ]-*/;

    
}
