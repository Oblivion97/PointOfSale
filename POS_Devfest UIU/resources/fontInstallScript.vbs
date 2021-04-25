Set objShell = CreateObject("Shell.Application")
Set objFolder = objShell.Namespace("C:\Windows\Font")
Set objFolderItem = objFolder.ParseName("Myriad Pro.ttf")
objFolderItem.InvokeVerb("Install")