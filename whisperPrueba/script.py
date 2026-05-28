import whisper

model = whisper.load_model("base")
result = model.transcribe("test3.aac")
print(result["text"])