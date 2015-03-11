package apple.corebluetooth;


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





@Library("CoreBluetooth")
@Mapping("CBCharacteristicWriteType")
public final class CBCharacteristicWriteType extends ObjCEnum {
    
    @GlobalConstant("CBCharacteristicWriteWithResponse")
    public static final long Response = 0L;
    @GlobalConstant("CBCharacteristicWriteWithoutResponse")
    public static final long outResponse = 1L;
    

}
