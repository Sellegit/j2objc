package apple.homekit;


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



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("HomeKit")
@Mapping("HMCharacteristicValueRotationDirection")
public final class HMCharacteristicValueRotationDirection extends ObjCEnum {
    
    @GlobalConstant("HMCharacteristicValueRotationDirectionClockwise")
    public static final long Clockwise = 0L;
    @GlobalConstant("HMCharacteristicValueRotationDirectionCounterClockwise")
    public static final long CounterClockwise = 1L;
    

}
