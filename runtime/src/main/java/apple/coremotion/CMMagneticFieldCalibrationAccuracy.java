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





@Library("CoreMotion")
@Mapping("CMMagneticFieldCalibrationAccuracy")
public final class CMMagneticFieldCalibrationAccuracy extends ObjCEnum {
    
    @GlobalConstant("CMMagneticFieldCalibrationAccuracyUncalibrated")
    public static final long Uncalibrated = -1L;
    @GlobalConstant("CMMagneticFieldCalibrationAccuracyLow")
    public static final long Low = 0L;
    @GlobalConstant("CMMagneticFieldCalibrationAccuracyMedium")
    public static final long Medium = 1L;
    @GlobalConstant("CMMagneticFieldCalibrationAccuracyHigh")
    public static final long High = 2L;
    

}
