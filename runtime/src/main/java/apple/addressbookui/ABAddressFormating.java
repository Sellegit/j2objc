package apple.addressbookui;


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
import apple.addressbook.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("AddressBookUI")
public class ABAddressFormating 
    extends Object 
     {

    
    
    
    
    
    @GlobalFunction("ABCreateStringWithAddressDictionary")
    public static native String createString(CFDictionary address, boolean addCountryName);
    
}
