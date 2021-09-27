package nl.hannahsten.texifyidea.run.compiler.latex

import com.intellij.openapi.vfs.VirtualFile
import nl.hannahsten.texifyidea.run.LatexRunConfiguration
import nl.hannahsten.texifyidea.settings.sdk.LatexSdkUtil

object LualatexCompiler : SupportedLatexCompiler("LuaLaTeX", "lualatex") {

    override val supportsUnicode = true

        override fun createCommand(
            runConfig: LatexRunConfiguration,
            auxilPath: String?,
            outputPath: String?,
            moduleRoot: VirtualFile?,
            moduleRoots: Array<VirtualFile>
        ): MutableList<String> {
            val command = mutableListOf(
                LatexSdkUtil.getExecutableName(
                    executableName,
                    runConfig.project,
                    runConfig.options.getLatexDistribution(runConfig.project)
                )
            )

        // Some commands are the same as for pdflatex
        command.add("-file-line-error")
        command.add("-interaction=nonstopmode")
        command.add("-synctex=1")
        command.add("-output-format=${runConfig.options.outputFormat.name.toLowerCase()}")

        command.add("-output-directory=$outputPath")

        // Note that lualatex has no -aux-directory
        return command
    }
}