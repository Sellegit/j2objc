package apple.audiotoolbox;


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
import apple.opengles.*;
import apple.coreaudio.*;
import apple.coremedia.*;





@Mapping("AURenderCallbackStruct") @Library("AudioToolbox/AudioToolbox.h")
public class AURenderCallbackStruct 
    extends Struct 
     {

    
    protected AURenderCallbackStruct() {}
    
    
    @DotMapping("inputProcRefCon")
    public native Todo getInputProcRefCon();
    
    
}
