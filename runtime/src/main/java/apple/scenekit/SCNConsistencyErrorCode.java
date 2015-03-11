package apple.scenekit;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.dispatch.*;
import apple.glkit.*;
import apple.spritekit.*;
import apple.opengles.*;





@Library("SceneKit")
@Mapping("SCNConsistencyErrorCode")
public final class SCNConsistencyErrorCode extends ObjCEnum {
    
    @GlobalConstant("SCNConsistencyInvalidURIError")
    public static final long InvalidURIError = 1000L;
    @GlobalConstant("SCNConsistencyInvalidCountError")
    public static final long InvalidCountError = 1001L;
    @GlobalConstant("SCNConsistencyInvalidArgumentError")
    public static final long InvalidArgumentError = 1002L;
    @GlobalConstant("SCNConsistencyMissingElementError")
    public static final long MissingElementError = 1003L;
    @GlobalConstant("SCNConsistencyMissingAttributeError")
    public static final long MissingAttributeError = 1004L;
    @GlobalConstant("SCNConsistencyXMLSchemaValidationError")
    public static final long XMLSchemaValidationError = 1005L;
    

}
