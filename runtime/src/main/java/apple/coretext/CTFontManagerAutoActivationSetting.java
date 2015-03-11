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






@Mapping("CTFontManagerAutoActivationSetting")
public final class CTFontManagerAutoActivationSetting extends ObjCEnum {
    
    @GlobalConstant("kCTFontManagerAutoActivationDefault")
    public static final long Default = 0L;
    @GlobalConstant("kCTFontManagerAutoActivationDisabled")
    public static final long Disabled = 1L;
    @GlobalConstant("kCTFontManagerAutoActivationEnabled")
    public static final long Enabled = 2L;
    @GlobalConstant("kCTFontManagerAutoActivationPromptUser")
    public static final long PromptUser = 3L;
    

}
