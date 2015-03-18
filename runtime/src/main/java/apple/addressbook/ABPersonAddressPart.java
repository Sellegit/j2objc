package apple.addressbook;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("AddressBook/AddressBook.h")
public class ABPersonAddressPart 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("kABPersonAddressStreetKey")
    public static native CFString StreetValue();
    @GlobalConstant("kABPersonAddressCityKey")
    public static native CFString CityValue();
    @GlobalConstant("kABPersonAddressStateKey")
    public static native CFString StateValue();
    @GlobalConstant("kABPersonAddressZIPKey")
    public static native CFString ZIPValue();
    @GlobalConstant("kABPersonAddressCountryKey")
    public static native CFString CountryValue();
    @GlobalConstant("kABPersonAddressCountryCodeKey")
    public static native CFString CountryCodeValue();
    
}
