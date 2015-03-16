package apple.gamecontroller;


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





@Library("GameController/GameController.h")
@Mapping("GCControllerPlayerIndex")
public final class GCControllerPlayerIndex extends ObjCEnum {
    
    @GlobalConstant("GCControllerPlayerIndexUnset")
    public static final long Unset = -1L;
    

}
