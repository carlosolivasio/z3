/*++
Copyright (c) 2012 Microsoft Corporation

Module Name:

    IDisposable.java

Abstract:

    Compatability interface (C# -> Java)

Author:

    Christoph Wintersteiger (cwinter) 2012-03-16

Notes:
    
--*/

package com.Microsoft.Z3;

public class IDisposable
{
    public void Dispose() throws Z3Exception {}
}
