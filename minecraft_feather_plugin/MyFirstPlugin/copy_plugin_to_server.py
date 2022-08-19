import os
import shutil

for file in os.listdir("target/"):
    if file.startswith("MyFirstPlugin") and file.endswith(".jar"):
        shutil.copyfile("target/{}".format(file), "/home/timc/SpigotServer/plugins/{}".format(file))