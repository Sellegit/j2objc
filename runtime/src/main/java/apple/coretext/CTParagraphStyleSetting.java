package apple.coretext;


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





@Mapping("CTParagraphStyleSetting") @Library("CoreText/CoreText.h")
public class CTParagraphStyleSetting 
    extends Struct 
     {

    
    protected CTParagraphStyleSetting() {}
    
    
    @DotMapping("spec")
    public native CTParagraphStyleSpecifier getSpec();
    @DotMapping("valueSize")
    public native @MachineSizedUInt long getValueSize();
    @DotMapping("value")
    public native Todo getValue();
    
    
}
