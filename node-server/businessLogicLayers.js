import fs from "fs/promises";

const loadJSON = async () => {
  const jsonString = await fs.readFile("./data/source.json", "utf-8");
  return JSON.parse(jsonString);
};

const getCitiesNumber = async (req, res) => {
  const letter = req.params.letter;
  const rawData = await loadJSON();
  const listCities = rawData.list.filter((x) =>
    x.name.toLowerCase().startsWith(letter.toLowerCase())
  );
  res.json(listCities.length);
};

export { getCitiesNumber };
